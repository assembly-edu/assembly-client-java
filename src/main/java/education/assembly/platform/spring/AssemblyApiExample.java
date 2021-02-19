/*
 * assembly-client-java 1.2.473
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

import education.assembly.platform.spring.*;
import education.assembly.platform.spring.models.*;
import education.assembly.platform.spring.AssemblyApi;

public class AssemblyApiExample {

    public static void main(String[] args) {
        // Optional. Send requests through Fiddler
        // Requires the Fiddler certificate in a trust store, to do this follow these instructions:
        // https://stackoverflow.com/questions/8549749/how-to-capture-https-with-fiddler-in-java#answer-8588914
        // System.setProperty("http.proxyHost", "127.0.0.1");
        // System.setProperty("https.proxyHost", "127.0.0.1");
        // System.setProperty("http.proxyPort", "8888");
        // System.setProperty("https.proxyPort", "8888");
        // System.setProperty("javax.net.ssl.trustStore", "C:\\dev\\fiddler\\FiddlerKeystore");
        // System.setProperty("javax.net.ssl.trustStorePassword", "password");

        // Create a configuration object with your credentials
        Configuration config = new Configuration(
            AssemblyEnvironment.Sandbox,
            "YOUR CLIENT ID",
            "YOUR CLIENT SECRET",
            "YOUR BASE64 ENCODED ACCESS TOKEN",
            "YOUR REFRESH TOKEN"
        );

        ApiClient client = new ApiClient(config);

        // Recommended. Set your application's name and version as the user agent, e.g.
        client.setUserAgent("AssemblyExampleClient-1.0");

        // Optional. Enable debugging
        // client.setDebugging(true);

        // Create an API instance and start using it:
        AssemblyApi api = new AssemblyApi(client);
        BulkResultsBody bulkResultsBody = new BulkResultsBody(); // BulkResultsBody | 
        try {
            BulkResultResponse result = api.bulkUpdateResults(bulkResultsBody);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling AssemblyApi#bulkUpdateResults");
            e.printStackTrace();
        }
    }
}

