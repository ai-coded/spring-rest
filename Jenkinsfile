pipeline {
  agent any

  stages {
    stage("One") {
      steps {
        echo "Hello christian"
      }
    }
    stage("Evaluate Master") {
      when {
        // skip this stage unless on Master branch
        branch "main"
      }
      steps {
        echo "World"
        echo "Heal it"
      }
    }
  }
}