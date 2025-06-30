pipeline {

  node {
    // This displays colors using the 'xterm' ansi color map.
    ansiColor('xterm') {
      // Just some echoes to show the ANSI color.
        stage "\u001B[31mI'm Red\u001B[0m Now not"
    }
}

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
