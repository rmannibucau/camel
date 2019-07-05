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

import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The crypto component is used for signing and verifying exchanges using the
 * Signature Service of the Java Cryptographic Extension (JCE).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DigitalSignatureEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Crypto (JCE) component.
     */
    public interface DigitalSignatureEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDigitalSignatureEndpointBuilder advanced() {
            return (AdvancedDigitalSignatureEndpointBuilder) this;
        }
        /**
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto:sign sets sign as the operation.
         * 
         * The option is a:
         * <code>org.apache.camel.component.crypto.CryptoOperation</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder cryptoOperation(
                CryptoOperation cryptoOperation) {
            setProperty("cryptoOperation", cryptoOperation);
            return this;
        }
        /**
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto:sign sets sign as the operation.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.crypto.CryptoOperation</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder cryptoOperation(
                String cryptoOperation) {
            setProperty("cryptoOperation", cryptoOperation);
            return this;
        }
        /**
         * The logical name of this operation.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * Sets the JCE name of the Algorithm that should be used for the
         * signer.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder algorithm(String algorithm) {
            setProperty("algorithm", algorithm);
            return this;
        }
        /**
         * Sets the alias used to query the KeyStore for keys and {link
         * java.security.cert.Certificate Certificates} to be used in signing
         * and verifying exchanges. This value can be provided at runtime via
         * the message header
         * org.apache.camel.component.crypto.DigitalSignatureConstants#KEYSTORE_ALIAS.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder alias(String alias) {
            setProperty("alias", alias);
            return this;
        }
        /**
         * Sets the reference name for a PrivateKey that can be found in the
         * registry.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder certificateName(
                String certificateName) {
            setProperty("certificateName", certificateName);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges. A KeyStore is typically used with an
         * alias, either one supplied in the Route definition or dynamically via
         * the message header CamelSignatureKeyStoreAlias. If no alias is
         * supplied and there is only a single entry in the Keystore, then this
         * single entry will be used.
         * 
         * The option is a: <code>java.security.KeyStore</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder keystore(KeyStore keystore) {
            setProperty("keystore", keystore);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges. A KeyStore is typically used with an
         * alias, either one supplied in the Route definition or dynamically via
         * the message header CamelSignatureKeyStoreAlias. If no alias is
         * supplied and there is only a single entry in the Keystore, then this
         * single entry will be used.
         * 
         * The option will be converted to a <code>java.security.KeyStore</code>
         * type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder keystore(String keystore) {
            setProperty("keystore", keystore);
            return this;
        }
        /**
         * Sets the reference name for a Keystore that can be found in the
         * registry.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder keystoreName(String keystoreName) {
            setProperty("keystoreName", keystoreName);
            return this;
        }
        /**
         * Set the PrivateKey that should be used to sign the exchange.
         * 
         * The option is a: <code>java.security.PrivateKey</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder privateKey(PrivateKey privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Set the PrivateKey that should be used to sign the exchange.
         * 
         * The option will be converted to a
         * <code>java.security.PrivateKey</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Sets the reference name for a PrivateKey that can be found in the
         * registry.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder privateKeyName(
                String privateKeyName) {
            setProperty("privateKeyName", privateKeyName);
            return this;
        }
        /**
         * Set the id of the security provider that provides the configured
         * Signature algorithm.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder provider(String provider) {
            setProperty("provider", provider);
            return this;
        }
        /**
         * references that should be resolved when the context changes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder publicKeyName(
                String publicKeyName) {
            setProperty("publicKeyName", publicKeyName);
            return this;
        }
        /**
         * Sets the reference name for a SecureRandom that can be found in the
         * registry.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder secureRandomName(
                String secureRandomName) {
            setProperty("secureRandomName", secureRandomName);
            return this;
        }
        /**
         * Set the name of the message header that should be used to store the
         * base64 encoded signature. This defaults to 'CamelDigitalSignature'.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DigitalSignatureEndpointBuilder signatureHeaderName(
                String signatureHeaderName) {
            setProperty("signatureHeaderName", signatureHeaderName);
            return this;
        }
        /**
         * Sets the password used to access an aliased PrivateKey in the
         * KeyStore.
         * 
         * The option is a: <code>char[]</code> type.
         * 
         * Group: security
         */
        default DigitalSignatureEndpointBuilder password(Character[] password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Sets the password used to access an aliased PrivateKey in the
         * KeyStore.
         * 
         * The option will be converted to a <code>char[]</code> type.
         * 
         * Group: security
         */
        default DigitalSignatureEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Crypto (JCE) component.
     */
    public interface AdvancedDigitalSignatureEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DigitalSignatureEndpointBuilder basic() {
            return (DigitalSignatureEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder basicPropertyBinding(
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
        default AdvancedDigitalSignatureEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Set the size of the buffer used to read in the Exchange payload data.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder bufferSize(
                Integer bufferSize) {
            setProperty("bufferSize", bufferSize);
            return this;
        }
        /**
         * Set the size of the buffer used to read in the Exchange payload data.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder bufferSize(
                String bufferSize) {
            setProperty("bufferSize", bufferSize);
            return this;
        }
        /**
         * Set the Certificate that should be used to verify the signature in
         * the exchange based on its payload.
         * 
         * The option is a: <code>java.security.cert.Certificate</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder certificate(
                Certificate certificate) {
            setProperty("certificate", certificate);
            return this;
        }
        /**
         * Set the Certificate that should be used to verify the signature in
         * the exchange based on its payload.
         * 
         * The option will be converted to a
         * <code>java.security.cert.Certificate</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder certificate(
                String certificate) {
            setProperty("certificate", certificate);
            return this;
        }
        /**
         * Determines if the Signature specific headers be cleared after signing
         * and verification. Defaults to true, and should only be made otherwise
         * at your extreme peril as vital private information such as Keys and
         * passwords may escape if unset.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder clearHeaders(
                boolean clearHeaders) {
            setProperty("clearHeaders", clearHeaders);
            return this;
        }
        /**
         * Determines if the Signature specific headers be cleared after signing
         * and verification. Defaults to true, and should only be made otherwise
         * at your extreme peril as vital private information such as Keys and
         * passwords may escape if unset.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder clearHeaders(
                String clearHeaders) {
            setProperty("clearHeaders", clearHeaders);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges based on the given
         * KeyStoreParameters. A KeyStore is typically used with an alias,
         * either one supplied in the Route definition or dynamically via the
         * message header CamelSignatureKeyStoreAlias. If no alias is supplied
         * and there is only a single entry in the Keystore, then this single
         * entry will be used.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.KeyStoreParameters</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder keyStoreParameters(
                Object keyStoreParameters) {
            setProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges based on the given
         * KeyStoreParameters. A KeyStore is typically used with an alias,
         * either one supplied in the Route definition or dynamically via the
         * message header CamelSignatureKeyStoreAlias. If no alias is supplied
         * and there is only a single entry in the Keystore, then this single
         * entry will be used.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.KeyStoreParameters</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder keyStoreParameters(
                String keyStoreParameters) {
            setProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Set the PublicKey that should be used to verify the signature in the
         * exchange.
         * 
         * The option is a: <code>java.security.PublicKey</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder publicKey(
                PublicKey publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the PublicKey that should be used to verify the signature in the
         * exchange.
         * 
         * The option will be converted to a
         * <code>java.security.PublicKey</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder publicKey(
                String publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the SecureRandom used to initialize the Signature service.
         * 
         * The option is a: <code>java.security.SecureRandom</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder secureRandom(
                SecureRandom secureRandom) {
            setProperty("secureRandom", secureRandom);
            return this;
        }
        /**
         * Set the SecureRandom used to initialize the Signature service.
         * 
         * The option will be converted to a
         * <code>java.security.SecureRandom</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDigitalSignatureEndpointBuilder secureRandom(
                String secureRandom) {
            setProperty("secureRandom", secureRandom);
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
        default AdvancedDigitalSignatureEndpointBuilder synchronous(
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
        default AdvancedDigitalSignatureEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.crypto.CryptoOperation</code> enum.
     */
    enum CryptoOperation {
        sign,
        verify;
    }
    /**
     * The crypto component is used for signing and verifying exchanges using
     * the Signature Service of the Java Cryptographic Extension (JCE).
     * Maven coordinates: org.apache.camel:camel-crypto
     */
    default DigitalSignatureEndpointBuilder digitalSignature(String path) {
        class DigitalSignatureEndpointBuilderImpl extends AbstractEndpointBuilder implements DigitalSignatureEndpointBuilder, AdvancedDigitalSignatureEndpointBuilder {
            public DigitalSignatureEndpointBuilderImpl(String path) {
                super("crypto", path);
            }
        }
        return new DigitalSignatureEndpointBuilderImpl(path);
    }
}