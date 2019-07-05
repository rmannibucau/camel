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
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The coap component is used for sending and receiving messages from COAP
 * capable devices.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CoAPEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the CoAP component.
     */
    public interface CoAPEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedCoAPEndpointConsumerBuilder advanced() {
            return (AdvancedCoAPEndpointConsumerBuilder) this;
        }
        /**
         * The URI for the CoAP endpoint.
         * 
         * The option is a: <code>java.net.URI</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder uri(URI uri) {
            setProperty("uri", uri);
            return this;
        }
        /**
         * The URI for the CoAP endpoint.
         * 
         * The option will be converted to a <code>java.net.URI</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder uri(String uri) {
            setProperty("uri", uri);
            return this;
        }
        /**
         * Sets the alias used to query the KeyStore for the private key and
         * certificate. This parameter is used when we are enabling TLS with
         * certificates on the service side, and similarly on the client side
         * when TLS is used with certificates and client authentication. If the
         * parameter is not specified then the default behavior is to use the
         * first alias in the keystore that contains a key entry. This
         * configuration parameter does not apply to configuring TLS via a Raw
         * Public Key or a Pre-Shared Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder alias(String alias) {
            setProperty("alias", alias);
            return this;
        }
        /**
         * Sets the cipherSuites String. This is a comma separated String of
         * ciphersuites to configure. If it is not specified, then it falls back
         * to getting the ciphersuites from the sslContextParameters object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder cipherSuites(String cipherSuites) {
            setProperty("cipherSuites", cipherSuites);
            return this;
        }
        /**
         * Sets the configuration options for server-side client-authentication
         * requirements. The value must be one of NONE, WANT, REQUIRE. If this
         * value is not specified, then it falls back to checking the
         * sslContextParameters.getServerParameters().getClientAuthentication()
         * value.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder clientAuthentication(
                String clientAuthentication) {
            setProperty("clientAuthentication", clientAuthentication);
            return this;
        }
        /**
         * Set the configured private key for use with Raw Public Key.
         * 
         * The option is a: <code>java.security.PrivateKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder privateKey(PrivateKey privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Set the configured private key for use with Raw Public Key.
         * 
         * The option will be converted to a
         * <code>java.security.PrivateKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Set the PskStore to use for pre-shared key.
         * 
         * The option is a:
         * <code>org.eclipse.californium.scandium.dtls.pskstore.PskStore</code>
         * type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder pskStore(Object pskStore) {
            setProperty("pskStore", pskStore);
            return this;
        }
        /**
         * Set the PskStore to use for pre-shared key.
         * 
         * The option will be converted to a
         * <code>org.eclipse.californium.scandium.dtls.pskstore.PskStore</code>
         * type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder pskStore(String pskStore) {
            setProperty("pskStore", pskStore);
            return this;
        }
        /**
         * Set the configured public key for use with Raw Public Key.
         * 
         * The option is a: <code>java.security.PublicKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder publicKey(PublicKey publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the configured public key for use with Raw Public Key.
         * 
         * The option will be converted to a
         * <code>java.security.PublicKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder publicKey(String publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS).
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS).
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * 
         * The option is a:
         * <code>org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder trustedRpkStore(
                Object trustedRpkStore) {
            setProperty("trustedRpkStore", trustedRpkStore);
            return this;
        }
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * 
         * The option will be converted to a
         * <code>org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointConsumerBuilder trustedRpkStore(
                String trustedRpkStore) {
            setProperty("trustedRpkStore", trustedRpkStore);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default CoAPEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default CoAPEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Comma separated list of methods that the CoAP consumer will bind to.
         * The default is to bind to all methods (DELETE, GET, POST, PUT).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default CoAPEndpointConsumerBuilder coapMethodRestrict(
                String coapMethodRestrict) {
            setProperty("coapMethodRestrict", coapMethodRestrict);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the CoAP component.
     */
    public interface AdvancedCoAPEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default CoAPEndpointConsumerBuilder basic() {
            return (CoAPEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedCoAPEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedCoAPEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedCoAPEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedCoAPEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCoAPEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedCoAPEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedCoAPEndpointConsumerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedCoAPEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the CoAP component.
     */
    public interface CoAPEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedCoAPEndpointProducerBuilder advanced() {
            return (AdvancedCoAPEndpointProducerBuilder) this;
        }
        /**
         * The URI for the CoAP endpoint.
         * 
         * The option is a: <code>java.net.URI</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder uri(URI uri) {
            setProperty("uri", uri);
            return this;
        }
        /**
         * The URI for the CoAP endpoint.
         * 
         * The option will be converted to a <code>java.net.URI</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder uri(String uri) {
            setProperty("uri", uri);
            return this;
        }
        /**
         * Sets the alias used to query the KeyStore for the private key and
         * certificate. This parameter is used when we are enabling TLS with
         * certificates on the service side, and similarly on the client side
         * when TLS is used with certificates and client authentication. If the
         * parameter is not specified then the default behavior is to use the
         * first alias in the keystore that contains a key entry. This
         * configuration parameter does not apply to configuring TLS via a Raw
         * Public Key or a Pre-Shared Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder alias(String alias) {
            setProperty("alias", alias);
            return this;
        }
        /**
         * Sets the cipherSuites String. This is a comma separated String of
         * ciphersuites to configure. If it is not specified, then it falls back
         * to getting the ciphersuites from the sslContextParameters object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder cipherSuites(String cipherSuites) {
            setProperty("cipherSuites", cipherSuites);
            return this;
        }
        /**
         * Sets the configuration options for server-side client-authentication
         * requirements. The value must be one of NONE, WANT, REQUIRE. If this
         * value is not specified, then it falls back to checking the
         * sslContextParameters.getServerParameters().getClientAuthentication()
         * value.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder clientAuthentication(
                String clientAuthentication) {
            setProperty("clientAuthentication", clientAuthentication);
            return this;
        }
        /**
         * Set the configured private key for use with Raw Public Key.
         * 
         * The option is a: <code>java.security.PrivateKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder privateKey(PrivateKey privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Set the configured private key for use with Raw Public Key.
         * 
         * The option will be converted to a
         * <code>java.security.PrivateKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Set the PskStore to use for pre-shared key.
         * 
         * The option is a:
         * <code>org.eclipse.californium.scandium.dtls.pskstore.PskStore</code>
         * type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder pskStore(Object pskStore) {
            setProperty("pskStore", pskStore);
            return this;
        }
        /**
         * Set the PskStore to use for pre-shared key.
         * 
         * The option will be converted to a
         * <code>org.eclipse.californium.scandium.dtls.pskstore.PskStore</code>
         * type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder pskStore(String pskStore) {
            setProperty("pskStore", pskStore);
            return this;
        }
        /**
         * Set the configured public key for use with Raw Public Key.
         * 
         * The option is a: <code>java.security.PublicKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder publicKey(PublicKey publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the configured public key for use with Raw Public Key.
         * 
         * The option will be converted to a
         * <code>java.security.PublicKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder publicKey(String publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS).
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS).
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * 
         * The option is a:
         * <code>org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder trustedRpkStore(
                Object trustedRpkStore) {
            setProperty("trustedRpkStore", trustedRpkStore);
            return this;
        }
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * 
         * The option will be converted to a
         * <code>org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointProducerBuilder trustedRpkStore(
                String trustedRpkStore) {
            setProperty("trustedRpkStore", trustedRpkStore);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default CoAPEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default CoAPEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the CoAP component.
     */
    public interface AdvancedCoAPEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default CoAPEndpointProducerBuilder basic() {
            return (CoAPEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCoAPEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedCoAPEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedCoAPEndpointProducerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedCoAPEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the CoAP component.
     */
    public interface CoAPEndpointBuilder
            extends
                CoAPEndpointConsumerBuilder, CoAPEndpointProducerBuilder {
        default AdvancedCoAPEndpointBuilder advanced() {
            return (AdvancedCoAPEndpointBuilder) this;
        }
        /**
         * The URI for the CoAP endpoint.
         * 
         * The option is a: <code>java.net.URI</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder uri(URI uri) {
            setProperty("uri", uri);
            return this;
        }
        /**
         * The URI for the CoAP endpoint.
         * 
         * The option will be converted to a <code>java.net.URI</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder uri(String uri) {
            setProperty("uri", uri);
            return this;
        }
        /**
         * Sets the alias used to query the KeyStore for the private key and
         * certificate. This parameter is used when we are enabling TLS with
         * certificates on the service side, and similarly on the client side
         * when TLS is used with certificates and client authentication. If the
         * parameter is not specified then the default behavior is to use the
         * first alias in the keystore that contains a key entry. This
         * configuration parameter does not apply to configuring TLS via a Raw
         * Public Key or a Pre-Shared Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder alias(String alias) {
            setProperty("alias", alias);
            return this;
        }
        /**
         * Sets the cipherSuites String. This is a comma separated String of
         * ciphersuites to configure. If it is not specified, then it falls back
         * to getting the ciphersuites from the sslContextParameters object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder cipherSuites(String cipherSuites) {
            setProperty("cipherSuites", cipherSuites);
            return this;
        }
        /**
         * Sets the configuration options for server-side client-authentication
         * requirements. The value must be one of NONE, WANT, REQUIRE. If this
         * value is not specified, then it falls back to checking the
         * sslContextParameters.getServerParameters().getClientAuthentication()
         * value.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder clientAuthentication(
                String clientAuthentication) {
            setProperty("clientAuthentication", clientAuthentication);
            return this;
        }
        /**
         * Set the configured private key for use with Raw Public Key.
         * 
         * The option is a: <code>java.security.PrivateKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder privateKey(PrivateKey privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Set the configured private key for use with Raw Public Key.
         * 
         * The option will be converted to a
         * <code>java.security.PrivateKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Set the PskStore to use for pre-shared key.
         * 
         * The option is a:
         * <code>org.eclipse.californium.scandium.dtls.pskstore.PskStore</code>
         * type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder pskStore(Object pskStore) {
            setProperty("pskStore", pskStore);
            return this;
        }
        /**
         * Set the PskStore to use for pre-shared key.
         * 
         * The option will be converted to a
         * <code>org.eclipse.californium.scandium.dtls.pskstore.PskStore</code>
         * type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder pskStore(String pskStore) {
            setProperty("pskStore", pskStore);
            return this;
        }
        /**
         * Set the configured public key for use with Raw Public Key.
         * 
         * The option is a: <code>java.security.PublicKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder publicKey(PublicKey publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the configured public key for use with Raw Public Key.
         * 
         * The option will be converted to a
         * <code>java.security.PublicKey</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder publicKey(String publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS).
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS).
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * 
         * The option is a:
         * <code>org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder trustedRpkStore(Object trustedRpkStore) {
            setProperty("trustedRpkStore", trustedRpkStore);
            return this;
        }
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * 
         * The option will be converted to a
         * <code>org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore</code> type.
         * 
         * Group: common
         */
        default CoAPEndpointBuilder trustedRpkStore(String trustedRpkStore) {
            setProperty("trustedRpkStore", trustedRpkStore);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the CoAP component.
     */
    public interface AdvancedCoAPEndpointBuilder
            extends
                AdvancedCoAPEndpointConsumerBuilder, AdvancedCoAPEndpointProducerBuilder {
        default CoAPEndpointBuilder basic() {
            return (CoAPEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCoAPEndpointBuilder basicPropertyBinding(
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
        default AdvancedCoAPEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedCoAPEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedCoAPEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The coap component is used for sending and receiving messages from COAP
     * capable devices.
     * Maven coordinates: org.apache.camel:camel-coap
     */
    default CoAPEndpointBuilder coAP(String path) {
        class CoAPEndpointBuilderImpl extends AbstractEndpointBuilder implements CoAPEndpointBuilder, AdvancedCoAPEndpointBuilder {
            public CoAPEndpointBuilderImpl(String path) {
                super("coap", path);
            }
        }
        return new CoAPEndpointBuilderImpl(path);
    }
}