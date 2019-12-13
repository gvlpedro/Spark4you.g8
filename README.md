## Spark4you.g8

Spark template 

### Requirements

    g8 0.11.0+
    sbt 1.3.0+

### Test g8:

    `sbt`

    `g8Scaffold controller`

### Setup new project with g8:

  1. Install Giter8 with Homebrew: 
  
            `brew update && brew install giter8``

  2. Start the app generation wizard: 

            `sbt new gvlpedro/Spark4you.g8`

  3. default parameters:

            package=com.project
            entity=Entity
            splineActive=false

### New features:
  1. Add project/Dependencies.scala
  2. Scalafmt configuration is used for format code. TODO
  3. Add optional lib Spline linage (0.4.0). TODO
