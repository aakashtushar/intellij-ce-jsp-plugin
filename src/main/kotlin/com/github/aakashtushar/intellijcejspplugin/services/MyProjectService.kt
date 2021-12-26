package com.github.aakashtushar.intellijcejspplugin.services

import com.intellij.openapi.project.Project
import com.github.aakashtushar.intellijcejspplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
