//
//  ========================================================================
//  Copyright (c) 1995-2018 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//


package org.eclipse.jetty.server.session;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.junit.After;
import org.junit.Test;

/**
 * ProxySerializationTest
 *
 *
 */
public class ProxySerializationTest extends AbstractProxySerializationTest
{
    
    /** 
     * @see org.eclipse.jetty.server.session.AbstractTestBase#createSessionDataStoreFactory()
     */
    @Override
    public SessionDataStoreFactory createSessionDataStoreFactory()
    {
       return JdbcTestHelper.newSessionDataStoreFactory();
    }
    
    

    /** 
     * @see org.eclipse.jetty.server.session.AbstractProxySerializationTest#customizeContext(org.eclipse.jetty.servlet.ServletContextHandler)
     */
    @Override
    public void customizeContext(ServletContextHandler c)
    {
    }
    
    

    @Test
    public void testProxySerialization() throws Exception
    {
        super.testProxySerialization();
    }

 
    
    @After
    public void tearDown() throws Exception 
    {
        JdbcTestHelper.shutdown(null);
    }
}
