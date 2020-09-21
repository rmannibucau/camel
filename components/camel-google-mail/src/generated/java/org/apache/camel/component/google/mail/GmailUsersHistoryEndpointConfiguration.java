
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.gmail.Gmail.Users.History}.
 */
@ApiParams(apiName = "history", 
           description = "The history collection of methods",
           apiMethods = {@ApiMethod(methodName = "list", description="Lists the history of all changes to the given mailbox", signatures={"com.google.api.services.gmail.Gmail$Users$History$List list(String userId)"})}, aliases = {})
@UriParams
@Configurer
public final class GmailUsersHistoryEndpointConfiguration extends GoogleMailConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "list", description="The user's email address. The special value me can be used to indicate the authenticated user. default: me")})
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
