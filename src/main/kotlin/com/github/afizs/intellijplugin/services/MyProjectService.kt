package com.github.afizs.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.afizs.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
