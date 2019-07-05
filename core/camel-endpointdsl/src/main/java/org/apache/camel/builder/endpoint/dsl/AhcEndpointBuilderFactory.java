/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.net.URI;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * To call external HTTP services using Async Http Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AhcEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AHC component.
     */
    public interface AhcEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedAhcEndpointBuilder advanced() {
            return (AdvancedAhcEndpointBuilder) this;
        }
        /**
         * The URI to use such as http://hostname:port/path.
         * 
         * The option is a: <code>java.net.URI</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder httpUri(URI httpUri) {
            setProperty("httpUri", httpUri);
            return this;
        }
        /**
         * The URI to use such as http://hostname:port/path.
         * 
         * The option will be converted to a <code>java.net.URI</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder httpUri(String httpUri) {
            setProperty("httpUri", httpUri);
            return this;
        }
        /**
         * If the option is true, then the Exchange.HTTP_URI header is ignored,
         * and use the endpoint's URI for request. You may also set the
         * throwExceptionOnFailure to be false to let the AhcProducer send all
         * the fault response back.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder bridgeEndpoint(boolean bridgeEndpoint) {
            setProperty("bridgeEndpoint", bridgeEndpoint);
            return this;
        }
        /**
         * If the option is true, then the Exchange.HTTP_URI header is ignored,
         * and use the endpoint's URI for request. You may also set the
         * throwExceptionOnFailure to be false to let the AhcProducer send all
         * the fault response back.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder bridgeEndpoint(String bridgeEndpoint) {
            setProperty("bridgeEndpoint", bridgeEndpoint);
            return this;
        }
        /**
         * The initial in-memory buffer size used when transferring data between
         * Camel and AHC Client.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder bufferSize(int bufferSize) {
            setProperty("bufferSize", bufferSize);
            return this;
        }
        /**
         * The initial in-memory buffer size used when transferring data between
         * Camel and AHC Client.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder bufferSize(String bufferSize) {
            setProperty("bufferSize", bufferSize);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            setProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            setProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Option to disable throwing the AhcOperationFailedException in case of
         * failed responses from the remote server. This allows you to get all
         * responses regardless of the HTTP status code.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder throwExceptionOnFailure(
                boolean throwExceptionOnFailure) {
            setProperty("throwExceptionOnFailure", throwExceptionOnFailure);
            return this;
        }
        /**
         * Option to disable throwing the AhcOperationFailedException in case of
         * failed responses from the remote server. This allows you to get all
         * responses regardless of the HTTP status code.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder throwExceptionOnFailure(
                String throwExceptionOnFailure) {
            setProperty("throwExceptionOnFailure", throwExceptionOnFailure);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type (for example
         * using Jetty or Servlet Camel components). On the producer side the
         * exception will be deserialized and thrown as is, instead of the
         * AhcOperationFailedException. The caused exception is required to be
         * serialized. This is by default turned off. If you enable this then be
         * aware that Java will deserialize the incoming data from the request
         * to Java and that can be a potential security risk.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder transferException(boolean transferException) {
            setProperty("transferException", transferException);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type (for example
         * using Jetty or Servlet Camel components). On the producer side the
         * exception will be deserialized and thrown as is, instead of the
         * AhcOperationFailedException. The caused exception is required to be
         * serialized. This is by default turned off. If you enable this then be
         * aware that Java will deserialize the incoming data from the request
         * to Java and that can be a potential security risk.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default AhcEndpointBuilder transferException(String transferException) {
            setProperty("transferException", transferException);
            return this;
        }
        /**
         * Reference to a org.apache.camel.support.jsse.SSLContextParameters in
         * the Registry. This reference overrides any configured
         * SSLContextParameters at the component level. See Using the JSSE
         * Configuration Utility. Note that configuring this option will
         * override any SSL/TLS configuration options provided through the
         * clientConfig option at the endpoint or component level.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default AhcEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Reference to a org.apache.camel.support.jsse.SSLContextParameters in
         * the Registry. This reference overrides any configured
         * SSLContextParameters at the component level. See Using the JSSE
         * Configuration Utility. Note that configuring this option will
         * override any SSL/TLS configuration options provided through the
         * clientConfig option at the endpoint or component level.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default AhcEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AHC component.
     */
    public interface AdvancedAhcEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AhcEndpointBuilder basic() {
            return (AhcEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom AhcBinding which allows to control how to bind
         * between AHC and Camel.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ahc.AhcBinding</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder binding(Object binding) {
            setProperty("binding", binding);
            return this;
        }
        /**
         * To use a custom AhcBinding which allows to control how to bind
         * between AHC and Camel.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ahc.AhcBinding</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder binding(String binding) {
            setProperty("binding", binding);
            return this;
        }
        /**
         * To configure the AsyncHttpClient to use a custom
         * com.ning.http.client.AsyncHttpClientConfig instance.
         * 
         * The option is a:
         * <code>org.asynchttpclient.AsyncHttpClientConfig</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder clientConfig(Object clientConfig) {
            setProperty("clientConfig", clientConfig);
            return this;
        }
        /**
         * To configure the AsyncHttpClient to use a custom
         * com.ning.http.client.AsyncHttpClientConfig instance.
         * 
         * The option will be converted to a
         * <code>org.asynchttpclient.AsyncHttpClientConfig</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder clientConfig(String clientConfig) {
            setProperty("clientConfig", clientConfig);
            return this;
        }
        /**
         * To configure the AsyncHttpClientConfig using the key/values from the
         * Map.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder clientConfigOptions(
                Map<String, Object> clientConfigOptions) {
            setProperty("clientConfigOptions", clientConfigOptions);
            return this;
        }
        /**
         * To configure the AsyncHttpClientConfig using the key/values from the
         * Map.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder clientConfigOptions(
                String clientConfigOptions) {
            setProperty("clientConfigOptions", clientConfigOptions);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAhcEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * To configure the AsyncHttpClientConfig Realm using the key/values
         * from the Map.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: security
         */
        default AdvancedAhcEndpointBuilder clientConfigRealmOptions(
                Map<String, Object> clientConfigRealmOptions) {
            setProperty("clientConfigRealmOptions", clientConfigRealmOptions);
            return this;
        }
        /**
         * To configure the AsyncHttpClientConfig Realm using the key/values
         * from the Map.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: security
         */
        default AdvancedAhcEndpointBuilder clientConfigRealmOptions(
                String clientConfigRealmOptions) {
            setProperty("clientConfigRealmOptions", clientConfigRealmOptions);
            return this;
        }
    }
    /**
     * To call external HTTP services using Async Http Client.
     * Maven coordinates: org.apache.camel:camel-ahc
     */
    default AhcEndpointBuilder ahc(String path) {
        class AhcEndpointBuilderImpl extends AbstractEndpointBuilder implements AhcEndpointBuilder, AdvancedAhcEndpointBuilder {
            public AhcEndpointBuilderImpl(String path) {
                super("ahc", path);
            }
        }
        return new AhcEndpointBuilderImpl(path);
    }
}