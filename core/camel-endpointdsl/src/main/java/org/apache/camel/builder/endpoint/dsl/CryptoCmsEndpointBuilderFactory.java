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
import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The crypto cms component is used for encrypting data in CMS Enveloped Data
 * format, decrypting CMS Enveloped Data, signing data in CMS Signed Data
 * format, and verifying CMS Signed Data.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CryptoCmsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Crypto CMS component.
     */
    public interface CryptoCmsEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedCryptoCmsEndpointBuilder advanced() {
            return (AdvancedCryptoCmsEndpointBuilder) this;
        }
        /**
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto-cms:sign sets sign as the operation.
         * Possible values: sign, verify, encrypt, or decrypt.
         * 
         * The option is a:
         * <code>org.apache.camel.component.crypto.cms.CryptoOperation</code>
         * type.
         * 
         * Group: producer
         */
        default CryptoCmsEndpointBuilder cryptoOperation(
                CryptoOperation cryptoOperation) {
            setProperty("cryptoOperation", cryptoOperation);
            return this;
        }
        /**
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto-cms:sign sets sign as the operation.
         * Possible values: sign, verify, encrypt, or decrypt.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.crypto.cms.CryptoOperation</code>
         * type.
         * 
         * Group: producer
         */
        default CryptoCmsEndpointBuilder cryptoOperation(String cryptoOperation) {
            setProperty("cryptoOperation", cryptoOperation);
            return this;
        }
        /**
         * The name part in the URI can be chosen by the user to distinguish
         * between different signer/verifier/encryptor/decryptor endpoints
         * within the camel context.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default CryptoCmsEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * Keystore which contains signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter
         * 'keyStoreParameters'.
         * 
         * The option is a: <code>java.security.KeyStore</code> type.
         * 
         * Group: common
         */
        default CryptoCmsEndpointBuilder keyStore(KeyStore keyStore) {
            setProperty("keyStore", keyStore);
            return this;
        }
        /**
         * Keystore which contains signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter
         * 'keyStoreParameters'.
         * 
         * The option will be converted to a <code>java.security.KeyStore</code>
         * type.
         * 
         * Group: common
         */
        default CryptoCmsEndpointBuilder keyStore(String keyStore) {
            setProperty("keyStore", keyStore);
            return this;
        }
        /**
         * Keystore containing signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter 'keystore'.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.KeyStoreParameters</code> type.
         * 
         * Group: common
         */
        default CryptoCmsEndpointBuilder keyStoreParameters(
                Object keyStoreParameters) {
            setProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Keystore containing signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter 'keystore'.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.KeyStoreParameters</code> type.
         * 
         * Group: common
         */
        default CryptoCmsEndpointBuilder keyStoreParameters(
                String keyStoreParameters) {
            setProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Sets the password of the private keys. It is assumed that all private
         * keys in the keystore have the same password. If not set then it is
         * assumed that the password of the private keys is given by the
         * keystore password given in the KeyStoreParameters.
         * 
         * The option is a: <code>char[]</code> type.
         * 
         * Group: decrypt
         */
        default CryptoCmsEndpointBuilder password(Character[] password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Sets the password of the private keys. It is assumed that all private
         * keys in the keystore have the same password. If not set then it is
         * assumed that the password of the private keys is given by the
         * keystore password given in the KeyStoreParameters.
         * 
         * The option will be converted to a <code>char[]</code> type.
         * 
         * Group: decrypt
         */
        default CryptoCmsEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * If true then the CMS message is base 64 encoded and must be decoded
         * during the processing. Default value is false.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: decrypt_verify
         */
        default CryptoCmsEndpointBuilder fromBase64(Boolean fromBase64) {
            setProperty("fromBase64", fromBase64);
            return this;
        }
        /**
         * If true then the CMS message is base 64 encoded and must be decoded
         * during the processing. Default value is false.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: decrypt_verify
         */
        default CryptoCmsEndpointBuilder fromBase64(String fromBase64) {
            setProperty("fromBase64", fromBase64);
            return this;
        }
        /**
         * Encryption algorithm, for example DESede/CBC/PKCS5Padding. Further
         * possible values: DESede/CBC/PKCS5Padding, AES/CBC/PKCS5Padding,
         * Camellia/CBC/PKCS5Padding, CAST5/CBC/PKCS5Padding.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder contentEncryptionAlgorithm(
                String contentEncryptionAlgorithm) {
            setProperty("contentEncryptionAlgorithm", contentEncryptionAlgorithm);
            return this;
        }
        /**
         * Provider for the originator info. See
         * https://tools.ietf.org/html/rfc5652#section-6.1. The default value is
         * null.
         * 
         * The option is a:
         * <code>org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder originatorInformationProvider(
                Object originatorInformationProvider) {
            setProperty("originatorInformationProvider", originatorInformationProvider);
            return this;
        }
        /**
         * Provider for the originator info. See
         * https://tools.ietf.org/html/rfc5652#section-6.1. The default value is
         * null.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder originatorInformationProvider(
                String originatorInformationProvider) {
            setProperty("originatorInformationProvider", originatorInformationProvider);
            return this;
        }
        /**
         * Recipient Info: reference to a bean which implements the interface
         * org.apache.camel.component.crypto.cms.api.TransRecipientInfo.
         * 
         * The option is a:
         * <code>java.util.List&lt;org.apache.camel.component.crypto.cms.crypt.RecipientInfo&gt;</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder recipient(List<Object> recipient) {
            setProperty("recipient", recipient);
            return this;
        }
        /**
         * Recipient Info: reference to a bean which implements the interface
         * org.apache.camel.component.crypto.cms.api.TransRecipientInfo.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;org.apache.camel.component.crypto.cms.crypt.RecipientInfo&gt;</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder recipient(String recipient) {
            setProperty("recipient", recipient);
            return this;
        }
        /**
         * Key length for the secret symmetric key used for the content
         * encryption. Only used if the specified content-encryption algorithm
         * allows keys of different sizes. If
         * contentEncryptionAlgorithm=AES/CBC/PKCS5Padding or
         * Camellia/CBC/PKCS5Padding then 128; if
         * contentEncryptionAlgorithm=DESede/CBC/PKCS5Padding then 192, 128; if
         * strong encryption is enabled then for AES/CBC/PKCS5Padding and
         * Camellia/CBC/PKCS5Padding also the key lengths 192 and 256 are
         * possible.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder secretKeyLength(int secretKeyLength) {
            setProperty("secretKeyLength", secretKeyLength);
            return this;
        }
        /**
         * Key length for the secret symmetric key used for the content
         * encryption. Only used if the specified content-encryption algorithm
         * allows keys of different sizes. If
         * contentEncryptionAlgorithm=AES/CBC/PKCS5Padding or
         * Camellia/CBC/PKCS5Padding then 128; if
         * contentEncryptionAlgorithm=DESede/CBC/PKCS5Padding then 192, 128; if
         * strong encryption is enabled then for AES/CBC/PKCS5Padding and
         * Camellia/CBC/PKCS5Padding also the key lengths 192 and 256 are
         * possible.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder secretKeyLength(String secretKeyLength) {
            setProperty("secretKeyLength", secretKeyLength);
            return this;
        }
        /**
         * Provider of the generator for the unprotected attributes. The default
         * value is null which means no unprotected attribute is added to the
         * Enveloped Data object. See
         * https://tools.ietf.org/html/rfc5652#section-6.1.
         * 
         * The option is a:
         * <code>org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder unprotectedAttributesGeneratorProvider(
                Object unprotectedAttributesGeneratorProvider) {
            setProperty("unprotectedAttributesGeneratorProvider", unprotectedAttributesGeneratorProvider);
            return this;
        }
        /**
         * Provider of the generator for the unprotected attributes. The default
         * value is null which means no unprotected attribute is added to the
         * Enveloped Data object. See
         * https://tools.ietf.org/html/rfc5652#section-6.1.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider</code> type.
         * 
         * Group: encrypt
         */
        default CryptoCmsEndpointBuilder unprotectedAttributesGeneratorProvider(
                String unprotectedAttributesGeneratorProvider) {
            setProperty("unprotectedAttributesGeneratorProvider", unprotectedAttributesGeneratorProvider);
            return this;
        }
        /**
         * Indicates whether the Signed Data or Enveloped Data instance shall be
         * base 64 encoded. Default value is false.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: encrypt_sign
         */
        default CryptoCmsEndpointBuilder toBase64(Boolean toBase64) {
            setProperty("toBase64", toBase64);
            return this;
        }
        /**
         * Indicates whether the Signed Data or Enveloped Data instance shall be
         * base 64 encoded. Default value is false.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: encrypt_sign
         */
        default CryptoCmsEndpointBuilder toBase64(String toBase64) {
            setProperty("toBase64", toBase64);
            return this;
        }
        /**
         * Indicates whether the signed content should be included into the
         * Signed Data instance. If false then a detached Signed Data instance
         * is created in the header CamelCryptoCmsSignedData.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: sign
         */
        default CryptoCmsEndpointBuilder includeContent(Boolean includeContent) {
            setProperty("includeContent", includeContent);
            return this;
        }
        /**
         * Indicates whether the signed content should be included into the
         * Signed Data instance. If false then a detached Signed Data instance
         * is created in the header CamelCryptoCmsSignedData.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: sign
         */
        default CryptoCmsEndpointBuilder includeContent(String includeContent) {
            setProperty("includeContent", includeContent);
            return this;
        }
        /**
         * Signer information: reference to bean(s) which implements
         * org.apache.camel.component.crypto.cms.api.SignerInfo. Multiple values
         * can be separated by comma.
         * 
         * The option is a:
         * <code>java.util.List&lt;org.apache.camel.component.crypto.cms.sig.SignerInfo&gt;</code> type.
         * 
         * Group: sign
         */
        default CryptoCmsEndpointBuilder signer(List<Object> signer) {
            setProperty("signer", signer);
            return this;
        }
        /**
         * Signer information: reference to bean(s) which implements
         * org.apache.camel.component.crypto.cms.api.SignerInfo. Multiple values
         * can be separated by comma.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;org.apache.camel.component.crypto.cms.sig.SignerInfo&gt;</code> type.
         * 
         * Group: sign
         */
        default CryptoCmsEndpointBuilder signer(String signer) {
            setProperty("signer", signer);
            return this;
        }
        /**
         * Indicates whether the value in the header CamelCryptoCmsSignedData is
         * base64 encoded. Default value is false. Only relevant for detached
         * signatures. In the detached signature case, the header contains the
         * Signed Data object.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: verify
         */
        default CryptoCmsEndpointBuilder signedDataHeaderBase64(
                Boolean signedDataHeaderBase64) {
            setProperty("signedDataHeaderBase64", signedDataHeaderBase64);
            return this;
        }
        /**
         * Indicates whether the value in the header CamelCryptoCmsSignedData is
         * base64 encoded. Default value is false. Only relevant for detached
         * signatures. In the detached signature case, the header contains the
         * Signed Data object.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: verify
         */
        default CryptoCmsEndpointBuilder signedDataHeaderBase64(
                String signedDataHeaderBase64) {
            setProperty("signedDataHeaderBase64", signedDataHeaderBase64);
            return this;
        }
        /**
         * If true then the signatures of all signers contained in the Signed
         * Data object are verified. If false then only one signature whose
         * signer info matches with one of the specified certificates is
         * verified. Default value is true.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: verify
         */
        default CryptoCmsEndpointBuilder verifySignaturesOfAllSigners(
                Boolean verifySignaturesOfAllSigners) {
            setProperty("verifySignaturesOfAllSigners", verifySignaturesOfAllSigners);
            return this;
        }
        /**
         * If true then the signatures of all signers contained in the Signed
         * Data object are verified. If false then only one signature whose
         * signer info matches with one of the specified certificates is
         * verified. Default value is true.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: verify
         */
        default CryptoCmsEndpointBuilder verifySignaturesOfAllSigners(
                String verifySignaturesOfAllSigners) {
            setProperty("verifySignaturesOfAllSigners", verifySignaturesOfAllSigners);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Crypto CMS component.
     */
    public interface AdvancedCryptoCmsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CryptoCmsEndpointBuilder basic() {
            return (CryptoCmsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCryptoCmsEndpointBuilder basicPropertyBinding(
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
        default AdvancedCryptoCmsEndpointBuilder basicPropertyBinding(
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
        default AdvancedCryptoCmsEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedCryptoCmsEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.crypto.cms.CryptoOperation</code> enum.
     */
    enum CryptoOperation {
        sign,
        verify,
        encrypt,
        decrypt;
    }
    /**
     * The crypto cms component is used for encrypting data in CMS Enveloped
     * Data format, decrypting CMS Enveloped Data, signing data in CMS Signed
     * Data format, and verifying CMS Signed Data.
     * Maven coordinates: org.apache.camel:camel-crypto-cms
     */
    default CryptoCmsEndpointBuilder cryptoCms(String path) {
        class CryptoCmsEndpointBuilderImpl extends AbstractEndpointBuilder implements CryptoCmsEndpointBuilder, AdvancedCryptoCmsEndpointBuilder {
            public CryptoCmsEndpointBuilderImpl(String path) {
                super("crypto-cms", path);
            }
        }
        return new CryptoCmsEndpointBuilderImpl(path);
    }
}