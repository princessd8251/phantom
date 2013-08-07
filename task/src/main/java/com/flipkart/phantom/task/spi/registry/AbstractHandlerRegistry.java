/*
 * Copyright 2012-2015, the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flipkart.phantom.task.spi.registry;

import com.flipkart.phantom.task.spi.TaskContext;

import java.util.List;
import java.util.Map;

/**
 * Abstract class for handler registry. Controls lifecycle methods of all handlers understood by the registry.
 *
 * @author kartikbu
 * @version 1.0
 * @created 30/7/13 12:43 AM
 */
abstract public class AbstractHandlerRegistry {

    /**
     * Lifecycle init method. This should initialize all individual handlers understood.
     * @param proxyHandlerConfigInfoList List of HandlerConfigInfo which is to be analysed and initialize
     * @param taskContext The task context object
     * @throws Exception
     */
    public abstract void init(List<ProxyHandlerConfigInfo> proxyHandlerConfigInfoList, TaskContext taskContext) throws Exception;

    /**
     * Method to reinitialize a handler.
     * @param handlerName Name of the handler.
     * @param taskContext task context object
     * @throws Exception
     */
    public abstract void reinitHandler(String handlerName, TaskContext taskContext) throws Exception;

    /**
     * Lifecycle shutdown method. This should shutdown all individual handlers understood.
     * @param taskContext The task context object
     * @throws Exception
     */
    public abstract void shutdown(TaskContext taskContext) throws Exception;

    /**
     * Enumeration method for all handlers. This should returns a map of name to description of each handler. Used in dashboard
     * @return Map map of handler name to description
     */
    public abstract Map<String,String> getHandlers();

}
