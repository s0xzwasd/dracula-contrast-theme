package com.github.s0xzwasd.draculacontrasttheme.services

import com.intellij.openapi.project.Project
import com.github.s0xzwasd.draculacontrasttheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
