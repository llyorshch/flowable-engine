package org.flowable.common.engine.api.tenant;

import java.util.HashMap;
import java.util.Map;

/**
 * Container class to return the result of a change in a tenant id operation (produced by a {@link ChangeTenantIdBuilder})
 */
public class ChangeTenantIdResult {

    public static enum Key {
        ActivityInstances,
        CaseInstances,
        DeadLetterJobs,
        EventSubscriptions,
        Executions,
        ExternalWorkerJobs,
        HistoricActivityInstances,
        HistoricCaseInstances,
        HistoricDecisionExecutions,
        HistoricMilestoneInstances,
        HistoricPlanItemInstances,
        HistoricProcessInstances,
        HistoricTaskInstances,
        HistoricTaskLogEntries,
        HistoryJobs,
        Jobs,
        MilestoneInstances,
        PlanItemInstances,
        SuspendedJobs,
        Tasks,
        TimerJobs,
        FormInstances,
        ContentItemInstances
    }

    private final Map<Key,Long> resultMap;

    private ChangeTenantIdResult() {
        this.resultMap = new HashMap<>();
    }

    public static ChangeTenantIdResult builder() {
        return new ChangeTenantIdResult();
    }

    public ChangeTenantIdResult addResult(Key key, Long value) {
        this.resultMap.put(key, value);
        return this;
    }

    public ChangeTenantIdResult build() {
        return this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((resultMap == null) ? 0 : resultMap.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ChangeTenantIdResult other = (ChangeTenantIdResult) obj;
        if (resultMap == null) {
            if (other.resultMap != null)
                return false;
        } else if (!resultMap.equals(other.resultMap))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ChangeTenantIdResult [resultMap=" + resultMap + "]";
    }

}
