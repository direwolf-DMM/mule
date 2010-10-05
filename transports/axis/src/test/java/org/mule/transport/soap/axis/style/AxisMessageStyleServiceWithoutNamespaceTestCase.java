/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.soap.axis.style;

public class AxisMessageStyleServiceWithoutNamespaceTestCase extends AxisMessageStyleServiceTestCase
{

    public String getConfigResources()
    {
        return "style/axis-mule-message-config-without-namespace.xml";
    }

    protected String getServiceEndpoint()
    {
        return "http://localhost:" + getPorts().get(0) + "/ServiceEntryPoint";
    }

}
