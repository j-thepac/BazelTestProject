# BazeltestProject
## Pre- Req:
### Mandatory Installation required :
- bazel version:            4.1.0
- scala version:            2.12
- python version:           3.10
- spark version[scala]:     3.1.2
- Java version:             1.8
- Kafka Version :           2.8.0

### Other Internal dependency versions
- bazel rules_jvm_external : 4.1
- bazel skylib : 1.1.1

## Steps to get started

####    Below steps to configure intelliJ but you could use any editor as recommended by Kyndryl
1. open https://plugins.jetbrains.com/plugin/8609-bazel/versions
2. check for the latest version of bazel plugin
3. Download the version of intelliJ which support latest Bazel plugin
4. Install intelliJ
5. Open IntelliJ
6. Goto preferences > plugins > search and install bazel plugin
7. You should be able to see bazel option in the tools bar

####   Configure Repo
1. open Terminal
2. git clone   - git@github.kyndryl.net:Kyndryl-CIO-Data-Platform/BazeltestProject.git
3. Open intellij
3. Import the above repo as Bazel project into intelliJ (next > next > ok)

### CodeBase
- [Python CodeBase](src/main/python/com/kyndryl/)
- [Scala CodeBase](src/main/scala/com/kyndryl/README.md)

## Teams
### DataMonks
- [ETL](src/main/scala/com/kyndryl/cpa/README.md)
- [Devops](src/main/python/com/kyndryl/cpa/README.md)

## More
- [Add New Dependecies](thirdparty/maven/README.md)
- [Learnings](documentation/README.md)

## Bazel Commands
### test
    bazel run scalatestname #from BUILD File
### run
    bazel run scalabinaryname #from BUILD File
### clean
    bazel clean --expunge
    rm -r $(bazel info repository_cache)

## Create and Execute jar File
    bazel build buildname_deploy.jar
    cd BazeltestProject/bazel-bin/src/main/scala/com/kyndryl/...
    mv buildname_deploy.jar /tmp/
    cd /tmp/
    spark-submit \
    --class src.main.scala.com...  \
    buildname_deploy.jar \
    <keywords if any>