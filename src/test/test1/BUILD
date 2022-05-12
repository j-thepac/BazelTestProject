load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary","scala_library","scala_test")
load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
package(default_visibility = ["//visibility:public"])

scala_test(
    name="unittestmainspec",
srcs = glob(["*.scala"]),
deps = [
        "mock",
        "//src/main/unittest:implementation"
        ]

)

java_library(
    name = "mock",
    exports = [
                "@maven//:org_scalamock_scalamock_2_12",
#                "@maven//:org_scalatest_scalatest_2_12"
        ],
#        visibility = ["//visibility:private"],
)