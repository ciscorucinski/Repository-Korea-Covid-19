package com.github.ciscorucinski.repositorykoreacovid19.services

import com.intellij.openapi.project.Project
import com.github.ciscorucinski.repositorykoreacovid19.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
