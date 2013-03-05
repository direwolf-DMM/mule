/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.nio.tcp.config;

import org.mule.config.spring.handlers.AbstractMuleNamespaceHandler;
import org.mule.config.spring.parsers.ClassOrRefDefinitionParser;
import org.mule.config.spring.parsers.generic.ChildDefinitionParser;
import org.mule.config.spring.parsers.generic.MuleOrphanDefinitionParser;
import org.mule.endpoint.URIBuilder;
import org.mule.transport.nio.tcp.PollingTcpConnector;
import org.mule.transport.nio.tcp.TcpConnector;
import org.mule.transport.nio.tcp.TcpProtocol;
import org.mule.transport.nio.tcp.protocols.CustomClassLoadingLengthProtocol;
import org.mule.transport.nio.tcp.protocols.DirectProtocol;
import org.mule.transport.nio.tcp.protocols.EOFProtocol;
import org.mule.transport.nio.tcp.protocols.LengthProtocol;
import org.mule.transport.nio.tcp.protocols.MuleMessageDirectProtocol;
import org.mule.transport.nio.tcp.protocols.MuleMessageEOFProtocol;
import org.mule.transport.nio.tcp.protocols.MuleMessageLengthProtocol;
import org.mule.transport.nio.tcp.protocols.MuleMessageSafeProtocol;
import org.mule.transport.nio.tcp.protocols.SafeProtocol;
import org.mule.transport.nio.tcp.protocols.StreamingProtocol;
import org.mule.transport.nio.tcp.protocols.XmlMessageEOFProtocol;
import org.mule.transport.nio.tcp.protocols.XmlMessageProtocol;

/**
 * Registers a Bean Definition Parser for handling <code><tcp:connector></code>
 * elements.
 */
public class TcpNamespaceHandler extends AbstractMuleNamespaceHandler
{
    private static final String TCP_PROTOCOL_PROPERTY = "tcpProtocol";

    public void init()
    {
//        registerStandardTransportEndpoints(TcpConnector.TCP, URIBuilder.SOCKET_ATTRIBUTES);
//        registerConnectorDefinitionParser(TcpConnector.class);
//
//        registerBeanDefinitionParser("polling-connector", new MuleOrphanDefinitionParser(
//            PollingTcpConnector.class, true));
//
//        registerBeanDefinitionParser("custom-protocol", new ChildDefinitionParser("tcpProtocol", null,
//            TcpProtocol.class, true));
//        registerBeanDefinitionParser("safe-protocol", new ByteOrMessageProtocolDefinitionParser(
//            SafeProtocol.class, MuleMessageSafeProtocol.class));
//        registerBeanDefinitionParser("direct-protocol", new ByteOrMessageProtocolDefinitionParser(
//            DirectProtocol.class, MuleMessageDirectProtocol.class));
//        registerBeanDefinitionParser("length-protocol", new ByteOrMessageProtocolDefinitionParser(
//            LengthProtocol.class, MuleMessageLengthProtocol.class));
//        registerBeanDefinitionParser("eof-protocol", new ByteOrMessageProtocolDefinitionParser(
//            EOFProtocol.class, MuleMessageEOFProtocol.class));
//        registerBeanDefinitionParser("xml-protocol", new ChildDefinitionParser("tcpProtocol",
//            XmlMessageProtocol.class));
//
//        registerBeanDefinitionParser("xml-eof-protocol", new ChildDefinitionParser("tcpProtocol",
//            XmlMessageEOFProtocol.class));
//
//        registerBeanDefinitionParser("streaming-protocol", new ByteOrMessageProtocolDefinitionParser(
//            StreamingProtocol.class, MuleMessageDirectProtocol.class));
//
//        registerBeanDefinitionParser("custom-protocol", new ClassOrRefDefinitionParser(TCP_PROTOCOL_PROPERTY));
//
//        registerBeanDefinitionParser("custom-class-loading-protocol",
//            new ByteOrMessageProtocolDefinitionParser(CustomClassLoadingLengthProtocol.class,
//                CustomClassLoadingLengthProtocol.class));
    }

}