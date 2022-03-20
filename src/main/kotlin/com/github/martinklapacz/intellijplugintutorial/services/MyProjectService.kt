package com.github.martinklapacz.intellijplugintutorial.services

import com.intellij.openapi.project.Project
import com.github.martinklapacz.intellijplugintutorial.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
