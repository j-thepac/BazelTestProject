load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary","scala_library")
package(default_visibility = ["//visibility:public"])

scala_binary(
    name="unittestmain",
    main_class="src.main.unittest.Test",
    srcs=[
        "Test.scala",
#        "A.scala"
#        ,"TestA.scala"
        ],
deps = [
    "implementation"
    ,"mock"
],

)

java_library(
    name = "mock",
    exports = [
            "@maven//:com_softwaremill_macwire_macros_2_11_2_3_7",
            '@maven//:com_softwaremill_macwire_util_2_12_2_3_7',
            '@maven//:com_softwaremill_macwire_proxy_2_12_2_3_7',
#            '@maven//:com_softwaremill_macwire_macrosakka_2_12'
#        "@maven//:org_json4s_json4s_core_2_12",
#        "@maven//:org_json4s_json4s_ast_2_12",
#        "@maven//:org_json4s_json4s_scalap_2_12",
        ]
    )

scala_library(
    name = "implementation",
    srcs = ["A.scala",
            "TestA.scala"
            ],
    deps = [

            ],

)
