/*
 * assembly-client-java 1.2.474
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

import org.springframework.stereotype.Component;


@Component("education.assembly.platform.spring.AssemblyEnvironment")
public enum AssemblyEnvironment {
    Production("https://platform.assembly.education", "https://api.assembly.education"),
    Sandbox("https://platform-sandbox.assembly.education", "https://api-sandbox.assembly.education");

    public final String authBaseUri;
    public final String dataBaseUri;

    AssemblyEnvironment(String authBaseUri, String dataBaseUri) {
        this.authBaseUri = authBaseUri;
        this.dataBaseUri = dataBaseUri;
    }

    public String authUri(String path) {
        return authBaseUri + "/" + path;
    }

    public String dataUri(String path) {
        return dataBaseUri + "/" + path;
    }

    public String authTokenUri() {
      return this.authUri("oauth/token");
    }

    public String authAuthorizeUri() {
      return this.authUri("oauth/authorize");
    }
}
