Couple of tests which break the eclipse compiler but work with the standard java compiler.

See 

* https://bugs.eclipse.org/bugs/show_bug.cgi?id=469217
* https://bugs.eclipse.org/bugs/show_bug.cgi?id=469317

### Install the Eclipse Mars compiler:


* Download https://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops4/S-4.5RC3-201505280700/org.eclipse.jdt-4.5RC3.zip
* Unzip and install the jar locally
* run `mvn -DgroupId=org.eclipse.tycho -DartifactId=org.eclipse.jdt.core -Dversion=3.11.0.v20150526-1109 -Dpackaging=jar -Dfile=plugins/org.eclipse.jdt.core_3.11.0.v20150526-1109.jar install:install-file`
