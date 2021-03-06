package com.thundermoose.plugins.paths;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectPaths implements Paths {
  @XmlElement
  @Matches({"/rest/api/1.0/projects"})
  private boolean projectList;
  @XmlElement
  @Matches({"/rest/api/1.0/projects/*/permissions/**"})
  private boolean permissions;
  @XmlElement
  @Matches({"/rest/api/1.0/projects/*/repos"})
  private boolean repoList;

  public ProjectPaths() { }

  public ProjectPaths(boolean projectList, boolean permissions, boolean repoList) {
    this.projectList = projectList;
    this.permissions = permissions;
    this.repoList = repoList;
  }

  public boolean getProjectList() {
    return projectList;
  }

  public void setProjectList(boolean projectList) {
    this.projectList = projectList;
  }

  public boolean getPermissions() {
    return permissions;
  }

  public void setPermissions(boolean permissions) {
    this.permissions = permissions;
  }

  public boolean getRepoList() {
    return repoList;
  }

  public void setRepoList(boolean repoList) {
    this.repoList = repoList;
  }

}
