# WORKSPACE
skylib_version = "1.1.1" #variable

############ Download - functionlaity "http_archive" ############
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
http_archive(
    name = "bazel_skylib",
    sha256 = "c6966ec828da198c5d9adbaa94c05e3a1c7f21bd012a0b29ba8ddbccb2c93b0d",
    type = "tar.gz",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib-{}.tar.gz".format(skylib_version, skylib_version),
)



############ Download - functionlaity "http_archive" ############
load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")
bazel_skylib_workspace()



############ Download - functionlaity "rules_scala_version" to perform scala operations ############
rules_scala_version="72c27ef603fc8b771fa80e3398c3fe7701af1515"
# rules_scala_version is the latest commit - https://github.com/bazelbuild/rules_scala/commit
http_archive(
    name = "io_bazel_rules_scala",
    strip_prefix = "rules_scala-%s" % rules_scala_version,
    type = "zip",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
#    sha256 = "a49d7d414e1284a152e2eee8da93497fe55829f86544e2df5797bfdcee9d2004"
)


# Stores Scala version and other configuration
# 2.12 is a default version, other versions can be use by passing them explicitly:
# scala_config(scala_version = "2.11.12")
load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")
scala_config()

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")
rules_proto_dependencies()
rules_proto_toolchains()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

# optional: setup ScalaTest toolchain and dependencies
load("@io_bazel_rules_scala//testing:scalatest.bzl", "scalatest_repositories", "scalatest_toolchain")
scalatest_repositories()
scalatest_toolchain()

############ Download - functionlaity "git"  ############
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")
git_repository(
    name = "rules_jvm_external",
    commit = "22b463c485f31b240888c89d17e67c460d7e68c0",
    remote = "https://github.com/bazelbuild/rules_jvm_external.git",
)


############ Download - functionlaity "maven"  ############
load("@rules_jvm_external//:defs.bzl", "maven_install")

#Add dependency here (note the same has to be updated in BUILD files in each packages under src
maven_install(
artifacts = ["org.scalamock:scalamock_2.12:5.1.0",
             #----------------Wire for Mocking--------
             "com.softwaremill.macwire:macros_2.11:2.3.7",
             "com.softwaremill.macwire:util_2.12:2.3.7",
             "com.softwaremill.macwire:proxy_2.12:2.3.7",
             "org.scalamock:scalamock_2.12:5.1.0",
             "com.vdurmont:emoji-java:5.1.1"
#             "com.vdurmont:com.kyndryltest.emoji-java:5.1.1"
             ],
    repositories = [
        "https://repo.maven.apache.org/maven2/",

    ],
)
