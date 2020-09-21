
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.calendar.Calendar.CalendarList}.
 */
@ApiParams(apiName = "list", 
           description = "The calendarList collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Deletes an entry on the user's calendar list", signatures={"com.google.api.services.calendar.Calendar$CalendarList$Delete delete(String calendarId)"}), @ApiMethod(methodName = "get", description="Returns an entry on the user's calendar list", signatures={"com.google.api.services.calendar.Calendar$CalendarList$Get get(String calendarId)"}), @ApiMethod(methodName = "insert", description="Adds an entry to the user's calendar list", signatures={"com.google.api.services.calendar.Calendar$CalendarList$Insert insert(com.google.api.services.calendar.model.CalendarListEntry content)"}), @ApiMethod(methodName = "list", description="Returns entries on the user's calendar list", signatures={"com.google.api.services.calendar.Calendar$CalendarList$List list()"}), @ApiMethod(methodName = "patch", description="Updates an entry on the user's calendar list", signatures={"com.google.api.services.calendar.Calendar$CalendarList$Patch patch(String calendarId, com.google.api.services.calendar.model.CalendarListEntry content)"}), @ApiMethod(methodName = "update", description="Updates an entry on the user's calendar list", signatures={"com.google.api.services.calendar.Calendar$CalendarList$Update update(String calendarId, com.google.api.services.calendar.model.CalendarListEntry content)"}), @ApiMethod(methodName = "watch", description="Watch for changes to CalendarList resources", signatures={"com.google.api.services.calendar.Calendar$CalendarList$Watch watch(com.google.api.services.calendar.model.Channel content)"})}, aliases = {})
@UriParams
@Configurer
public final class CalendarCalendarListEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "get", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "patch", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "update", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword.")})
    private String calendarId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "insert", description="The com.google.api.services.calendar.model.CalendarListEntry"), @ApiMethod(methodName = "patch", description="The com.google.api.services.calendar.model.CalendarListEntry"), @ApiMethod(methodName = "update", description="The com.google.api.services.calendar.model.CalendarListEntry")})
    private com.google.api.services.calendar.model.CalendarListEntry content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "watch", description="The com.google.api.services.calendar.model.Channel")})
    private com.google.api.services.calendar.model.Channel contentChannel;

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public com.google.api.services.calendar.model.CalendarListEntry getContent() {
        return content;
    }

    public void setContent(com.google.api.services.calendar.model.CalendarListEntry content) {
        this.content = content;
    }

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }
}
