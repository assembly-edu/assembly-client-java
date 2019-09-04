/*
 * assembly-client-java 1.2.419
 *
 * Copyright (c) 2018 Assembly
 * http://assembly.education
 * help@assembly.education
 *
 * Licensed under MIT (https://spdx.org/licenses/MIT.html)
 *
 * NOTE: This class has been automatically generated, do not edit manually.
 */

package education.assembly.platform.spring;

import java.util.UUID;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.DefaultOAuth2RefreshToken;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;
import org.threeten.bp.*;
import com.fasterxml.jackson.datatype.threetenbp.ThreeTenModule;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import com.fasterxml.jackson.databind.ObjectMapper;

import education.assembly.platform.spring.AssemblyEnvironment;


@Component("education.assembly.platform.spring.Configuration")
public class Configuration {
    private final AssemblyEnvironment env;

    private final DefaultOAuth2AccessToken accessToken;

    private final String clientId;

    private final String clientSecret;

    private final String state;

    public Configuration(AssemblyEnvironment env, String clientId, String clientSecret) {
        this(env, clientId, clientSecret, null, null);
    }

    public Configuration(AssemblyEnvironment env, String clientId, String clientSecret, String accessToken, String refreshToken) {
        this(env, clientId, clientSecret, new DefaultOAuth2AccessToken(accessToken));
        this.accessToken.setTokenType(DefaultOAuth2AccessToken.BEARER_TYPE);
        this.accessToken.setRefreshToken(new DefaultOAuth2RefreshToken(refreshToken));
    }

    public Configuration(AssemblyEnvironment env, String clientId, String clientSecret, DefaultOAuth2AccessToken accessToken) {
        this.env = env;
        this.clientId = (clientId == null ? "" : clientId);
        this.clientSecret = (clientSecret == null ? "" : clientSecret);
        this.accessToken = accessToken;
        this.state = UUID.randomUUID().toString();
    }

    public String getApiBaseUri() {
        return env.dataBaseUri;
    }

    public DefaultOAuth2ClientContext getContext() {
        DefaultOAuth2ClientContext context = new DefaultOAuth2ClientContext();
        context.setAccessToken(accessToken);
        context.setPreservedState("state", state);
        return context;
    }

    public AuthorizationCodeResourceDetails getResource() {
        AuthorizationCodeResourceDetails resource = new AuthorizationCodeResourceDetails();

        resource.setAccessTokenUri(env.authTokenUri());
        resource.setClientId(clientId);
        resource.setClientSecret(clientSecret);
        resource.setAuthenticationScheme(AuthenticationScheme.header);
        resource.setClientAuthenticationScheme(AuthenticationScheme.header);

        return resource;
    }

    public OAuth2RestTemplate getTemplate() {
        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(getResource(), getContext());
        restTemplate.setRetryBadAccessTokens(true);

        for(HttpMessageConverter converter:restTemplate.getMessageConverters()){
            if(converter instanceof AbstractJackson2HttpMessageConverter){
                ObjectMapper mapper = ((AbstractJackson2HttpMessageConverter)converter).getObjectMapper();
                ThreeTenModule module = new ThreeTenModule();
                module.addDeserializer(Instant.class, CustomInstantDeserializer.INSTANT);
                module.addDeserializer(OffsetDateTime.class, CustomInstantDeserializer.OFFSET_DATE_TIME);
                module.addDeserializer(ZonedDateTime.class, CustomInstantDeserializer.ZONED_DATE_TIME);
                mapper.registerModule(module);
            }
        }

        // This allows us to read the response more than once - Necessary for debugging.
        restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(restTemplate.getRequestFactory()));

        return restTemplate;
    }
}
