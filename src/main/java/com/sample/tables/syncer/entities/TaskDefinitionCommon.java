package com.sample.tables.syncer.entities;


public abstract class TaskDefinitionCommon {


    public abstract Long getId();

    public abstract String getName();

    public abstract String getDescription();



    public boolean equals(Long id, String name, String desc) {
        boolean result = false;
        result = this.getId().equals(id);
        if (result && this.getName() != null) {
            result = this.getName().equals(name);
        }

        if (result && this.getDescription() != null) {
            result = this.getDescription().equals(desc);
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof TaskDefinition) {
            TaskDefinition other = (TaskDefinition) obj;
            return this.equals(other.getId(), other.getName(), other.getDescription());
        } else if (obj instanceof TaskDefinitionMirror) {
            TaskDefinitionMirror other = (TaskDefinitionMirror) obj;
            return this.equals(other.getId(), other.getName(), other.getDescription());
        }
        return false;
    }

}
