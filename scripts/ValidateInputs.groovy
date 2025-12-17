#!/usr/bin/env groovy

println "== Starting validation =="

// Variables obligatorias (simulan env / Jenkins params)
def requiredEnvVars = [
    "APP_NAME",
    "ENVIRONMENT"
]

// Validar variables de entorno
requiredEnvVars.each { var ->
    def value = System.getenv(var)
    if (!value?.trim()) {
        println "ERROR: Required environment variable '${var}' is not defined."
        System.exit(1)
    }
    println "OK: ${var} = ${value}"
}

// Validar estructura del repo
def requiredPaths = [
    "scripts",
    ".github/workflows"
]

requiredPaths.each { path ->
    if (!new File(path).exists()) {
        println "ERROR: Required path '${path}' does not exist."
        System.exit(1)
    }
    println "OK: Path '${path}' exists"
}

println "== Validation finished successfully =="
System.exit(0)
