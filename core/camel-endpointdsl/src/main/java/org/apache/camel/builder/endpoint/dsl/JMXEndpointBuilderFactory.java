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

import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The jmx component allows to receive JMX notifications.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JMXEndpointBuilderFactory {


    /**
     * Builder for endpoint for the JMX component.
     */
    public interface JMXEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedJMXEndpointBuilder advanced() {
            return (AdvancedJMXEndpointBuilder) this;
        }
        /**
         * Server url comes from the remaining endpoint. Use platform to connect
         * to local JVM.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default JMXEndpointBuilder serverURL(String serverURL) {
            setProperty("serverURL", serverURL);
            return this;
        }
        /**
         * Format for the message body. Either xml or raw. If xml, the
         * notification is serialized to xml. If raw, then the raw java object
         * is set as the body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default JMXEndpointBuilder format(String format) {
            setProperty("format", format);
            return this;
        }
        /**
         * The frequency to poll the bean to check the monitor (monitor types
         * only).
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: consumer
         */
        default JMXEndpointBuilder granularityPeriod(long granularityPeriod) {
            setProperty("granularityPeriod", granularityPeriod);
            return this;
        }
        /**
         * The frequency to poll the bean to check the monitor (monitor types
         * only).
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: consumer
         */
        default JMXEndpointBuilder granularityPeriod(String granularityPeriod) {
            setProperty("granularityPeriod", granularityPeriod);
            return this;
        }
        /**
         * The type of monitor to create. One of string, gauge, counter (monitor
         * types only).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default JMXEndpointBuilder monitorType(String monitorType) {
            setProperty("monitorType", monitorType);
            return this;
        }
        /**
         * The domain for the mbean you're connecting to.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: consumer
         */
        default JMXEndpointBuilder objectDomain(String objectDomain) {
            setProperty("objectDomain", objectDomain);
            return this;
        }
        /**
         * The name key for the mbean you're connecting to. This value is
         * mutually exclusive with the object properties that get passed.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default JMXEndpointBuilder objectName(String objectName) {
            setProperty("objectName", objectName);
            return this;
        }
        /**
         * The attribute to observe for the monitor bean or consumer.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default JMXEndpointBuilder observedAttribute(String observedAttribute) {
            setProperty("observedAttribute", observedAttribute);
            return this;
        }
        /**
         * Initial threshold for the monitor. The value must exceed this before
         * notifications are fired (counter monitor only).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: counter
         */
        default JMXEndpointBuilder initThreshold(int initThreshold) {
            setProperty("initThreshold", initThreshold);
            return this;
        }
        /**
         * Initial threshold for the monitor. The value must exceed this before
         * notifications are fired (counter monitor only).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: counter
         */
        default JMXEndpointBuilder initThreshold(String initThreshold) {
            setProperty("initThreshold", initThreshold);
            return this;
        }
        /**
         * The value at which the counter is reset to zero (counter monitor
         * only).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: counter
         */
        default JMXEndpointBuilder modulus(int modulus) {
            setProperty("modulus", modulus);
            return this;
        }
        /**
         * The value at which the counter is reset to zero (counter monitor
         * only).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: counter
         */
        default JMXEndpointBuilder modulus(String modulus) {
            setProperty("modulus", modulus);
            return this;
        }
        /**
         * The amount to increment the threshold after it's been exceeded
         * (counter monitor only).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: counter
         */
        default JMXEndpointBuilder offset(int offset) {
            setProperty("offset", offset);
            return this;
        }
        /**
         * The amount to increment the threshold after it's been exceeded
         * (counter monitor only).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: counter
         */
        default JMXEndpointBuilder offset(String offset) {
            setProperty("offset", offset);
            return this;
        }
        /**
         * If true, then the value reported in the notification is the
         * difference from the threshold as opposed to the value itself (counter
         * and gauge monitor only).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder differenceMode(boolean differenceMode) {
            setProperty("differenceMode", differenceMode);
            return this;
        }
        /**
         * If true, then the value reported in the notification is the
         * difference from the threshold as opposed to the value itself (counter
         * and gauge monitor only).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder differenceMode(String differenceMode) {
            setProperty("differenceMode", differenceMode);
            return this;
        }
        /**
         * If true, the gauge will fire a notification when the high threshold
         * is exceeded (gauge monitor only).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder notifyHigh(boolean notifyHigh) {
            setProperty("notifyHigh", notifyHigh);
            return this;
        }
        /**
         * If true, the gauge will fire a notification when the high threshold
         * is exceeded (gauge monitor only).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder notifyHigh(String notifyHigh) {
            setProperty("notifyHigh", notifyHigh);
            return this;
        }
        /**
         * If true, the gauge will fire a notification when the low threshold is
         * exceeded (gauge monitor only).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder notifyLow(boolean notifyLow) {
            setProperty("notifyLow", notifyLow);
            return this;
        }
        /**
         * If true, the gauge will fire a notification when the low threshold is
         * exceeded (gauge monitor only).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder notifyLow(String notifyLow) {
            setProperty("notifyLow", notifyLow);
            return this;
        }
        /**
         * Value for the gauge's high threshold (gauge monitor only).
         * 
         * The option is a: <code>java.lang.Double</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder thresholdHigh(Double thresholdHigh) {
            setProperty("thresholdHigh", thresholdHigh);
            return this;
        }
        /**
         * Value for the gauge's high threshold (gauge monitor only).
         * 
         * The option will be converted to a <code>java.lang.Double</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder thresholdHigh(String thresholdHigh) {
            setProperty("thresholdHigh", thresholdHigh);
            return this;
        }
        /**
         * Value for the gauge's low threshold (gauge monitor only).
         * 
         * The option is a: <code>java.lang.Double</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder thresholdLow(Double thresholdLow) {
            setProperty("thresholdLow", thresholdLow);
            return this;
        }
        /**
         * Value for the gauge's low threshold (gauge monitor only).
         * 
         * The option will be converted to a <code>java.lang.Double</code> type.
         * 
         * Group: gauge
         */
        default JMXEndpointBuilder thresholdLow(String thresholdLow) {
            setProperty("thresholdLow", thresholdLow);
            return this;
        }
        /**
         * Credentials for making a remote connection.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default JMXEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Credentials for making a remote connection.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default JMXEndpointBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JMX component.
     */
    public interface AdvancedJMXEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default JMXEndpointBuilder basic() {
            return (JMXEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder basicPropertyBinding(
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
        default AdvancedJMXEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom shared thread pool for the consumers. By default each
         * consume has their own thread-pool to process and route notifications.
         * 
         * The option is a: <code>java.util.concurrent.ExecutorService</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder executorService(
                ExecutorService executorService) {
            setProperty("executorService", executorService);
            return this;
        }
        /**
         * To use a custom shared thread pool for the consumers. By default each
         * consume has their own thread-pool to process and route notifications.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.ExecutorService</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder executorService(
                String executorService) {
            setProperty("executorService", executorService);
            return this;
        }
        /**
         * Value to handback to the listener when a notification is received.
         * This value will be put in the message header with the key
         * jmx.handback.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder handback(Object handback) {
            setProperty("handback", handback);
            return this;
        }
        /**
         * Value to handback to the listener when a notification is received.
         * This value will be put in the message header with the key
         * jmx.handback.
         * 
         * The option will be converted to a <code>java.lang.Object</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder handback(String handback) {
            setProperty("handback", handback);
            return this;
        }
        /**
         * Reference to a bean that implements the NotificationFilter.
         * 
         * The option is a: <code>javax.management.NotificationFilter</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder notificationFilter(
                Object notificationFilter) {
            setProperty("notificationFilter", notificationFilter);
            return this;
        }
        /**
         * Reference to a bean that implements the NotificationFilter.
         * 
         * The option will be converted to a
         * <code>javax.management.NotificationFilter</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder notificationFilter(
                String notificationFilter) {
            setProperty("notificationFilter", notificationFilter);
            return this;
        }
        /**
         * Properties for the object name. These values will be used if the
         * objectName param is not set.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.String&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder objectProperties(
                Map<String, String> objectProperties) {
            setProperty("objectProperties", objectProperties);
            return this;
        }
        /**
         * Properties for the object name. These values will be used if the
         * objectName param is not set.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.String&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder objectProperties(
                String objectProperties) {
            setProperty("objectProperties", objectProperties);
            return this;
        }
        /**
         * The number of seconds to wait before attempting to retry
         * establishment of the initial connection or attempt to reconnect a
         * lost connection.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder reconnectDelay(int reconnectDelay) {
            setProperty("reconnectDelay", reconnectDelay);
            return this;
        }
        /**
         * The number of seconds to wait before attempting to retry
         * establishment of the initial connection or attempt to reconnect a
         * lost connection.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder reconnectDelay(String reconnectDelay) {
            setProperty("reconnectDelay", reconnectDelay);
            return this;
        }
        /**
         * If true the consumer will attempt to reconnect to the JMX server when
         * any connection failure occurs. The consumer will attempt to
         * re-establish the JMX connection every 'x' seconds until the
         * connection is made-- where 'x' is the configured reconnectionDelay.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder reconnectOnConnectionFailure(
                boolean reconnectOnConnectionFailure) {
            setProperty("reconnectOnConnectionFailure", reconnectOnConnectionFailure);
            return this;
        }
        /**
         * If true the consumer will attempt to reconnect to the JMX server when
         * any connection failure occurs. The consumer will attempt to
         * re-establish the JMX connection every 'x' seconds until the
         * connection is made-- where 'x' is the configured reconnectionDelay.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder reconnectOnConnectionFailure(
                String reconnectOnConnectionFailure) {
            setProperty("reconnectOnConnectionFailure", reconnectOnConnectionFailure);
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
        default AdvancedJMXEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedJMXEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * If true the consumer will throw an exception if unable to establish
         * the JMX connection upon startup. If false, the consumer will attempt
         * to establish the JMX connection every 'x' seconds until the
         * connection is made -- where 'x' is the configured reconnectionDelay.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder testConnectionOnStartup(
                boolean testConnectionOnStartup) {
            setProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
        /**
         * If true the consumer will throw an exception if unable to establish
         * the JMX connection upon startup. If false, the consumer will attempt
         * to establish the JMX connection every 'x' seconds until the
         * connection is made -- where 'x' is the configured reconnectionDelay.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJMXEndpointBuilder testConnectionOnStartup(
                String testConnectionOnStartup) {
            setProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
    }
    /**
     * The jmx component allows to receive JMX notifications.
     * Maven coordinates: org.apache.camel:camel-jmx
     */
    default JMXEndpointBuilder jMX(String path) {
        class JMXEndpointBuilderImpl extends AbstractEndpointBuilder implements JMXEndpointBuilder, AdvancedJMXEndpointBuilder {
            public JMXEndpointBuilderImpl(String path) {
                super("jmx", path);
            }
        }
        return new JMXEndpointBuilderImpl(path);
    }
}