/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.soap.axis;

import org.mule.transport.vm.VMConnector;

public class AxisConnectorVMFunctionalTestCase extends AbstractSoapResourceEndpointFunctionalTestCase
{
    @Override
    protected String getTransportProtocol()
    {
        return VMConnector.VM;
    }

    @Override
    protected String getSoapProvider()
    {
        return "axis";
    }

    @Override
    public String getConfigResources()
    {
        return "axis-" + getTransportProtocol() + "-mule-config.xml";
    }

    @Override
    protected int getNumPortsToFind()
    {
        // don't really need the ports, but the other tests which extend the same abstract class do
        return 1;
    }
}
