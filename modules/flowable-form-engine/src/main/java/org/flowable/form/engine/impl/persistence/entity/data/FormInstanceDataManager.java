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
package org.flowable.form.engine.impl.persistence.entity.data;

import java.util.List;

import org.flowable.common.engine.impl.persistence.entity.data.DataManager;
import org.flowable.form.api.FormInstance;
import org.flowable.form.engine.impl.FormInstanceQueryImpl;
import org.flowable.form.engine.impl.persistence.entity.FormInstanceEntity;

/**
 * @author Tijs Rademakers
 */
public interface FormInstanceDataManager extends DataManager<FormInstanceEntity> {

    long findFormInstanceCountByQueryCriteria(FormInstanceQueryImpl submittedFormQuery);

    List<FormInstance> findFormInstancesByQueryCriteria(FormInstanceQueryImpl submittedFormQuery);
    
    void deleteFormInstancesByFormDefinitionId(String formDefinitionId);
    
    void deleteFormInstancesByProcessDefinitionId(String processDefinitionId);
    
    void deleteFormInstancesByScopeDefinitionId(String scopeDefinitionId);

    long countChangeTenantIdFormInstances(String sourceTenantId, boolean onlyInstancesFromDefaultTenantDefinitions, String scope);

    long changeTenantIdFormInstances(String sourceTenantId, String targetTenantId, boolean onlyInstancesFromDefaultTenantDefinitions, String scope);

}
