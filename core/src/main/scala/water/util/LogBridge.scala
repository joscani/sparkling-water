/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package water.util

/**
  * This object is used to get and set log level defined in the H2O running on the current node
  */
object LogBridge {

  /**
    * Setup log level for H2O log sub system.
    *
    * @param levelIdx log level specified by the index.
    */
  def setH2OLogLevel(levelIdx: Int): Unit = {
    //water.util.Log._level = levelIdx
  }

  /**
    * Get the log level index
    *
    * @return index of the log level
    */
  def getH2OLogLevel() = 3
}
