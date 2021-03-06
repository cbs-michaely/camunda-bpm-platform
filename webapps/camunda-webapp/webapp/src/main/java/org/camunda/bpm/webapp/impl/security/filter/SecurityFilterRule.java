/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.camunda.bpm.webapp.impl.security.filter;

import javax.servlet.http.HttpServletRequest;



/**
 * <p>This interface is used by the {@link SecurityFilter} to check incoming requests for 
 * authorization.</p>
 * 
 * @author Daniel Meyer
 *
 */
public interface SecurityFilterRule {

  /**
   * 
   * @param req the {@link HttpServletRequest} to check for authorizatiobn.
   * @return true if the current request is authorized, false otherwise.
   */
  public boolean isRequestAuthorized(HttpServletRequest req);
  
}
