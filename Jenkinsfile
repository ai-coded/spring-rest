pipeline {

  stages {
    stage("One") {
      steps {
        echo "Hello christian"
      }
    }
    stage("Evaluate Master") {
      when {
        branch "main"
      }
      steps {
        echo "World"
        echo "Heal it"
      }
    }
  }
}
