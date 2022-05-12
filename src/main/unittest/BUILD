# java and python methods are available by default , others has to be explicilty imported as below
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary","scala_library")

#Package is visible across project
package(default_visibility = ["//visibility:public"])


#Main class has to be mentioned here
scala_binary(
    name="unittestmain",
    main_class="src.main.unittest.Test",
    #All class in the same package mentioned here
    srcs=[
        "Test.scala",
#        "A.scala"
#        ,"TestA.scala"
        ],
    #deps = java_library (external depencies) , scala_library (internal dependency)
    deps = [
        "implementation"
        ,"mock"
    ],
)


# All external jar files has to mentioned under java_library
java_library(
    name = "mock",
    #Any dependency we need has to be added to WORKSPACE file and has to be converted as below
    exports = [
            "@maven//:com_softwaremill_macwire_macros_2_11_2_3_7",
            '@maven//:com_softwaremill_macwire_util_2_12_2_3_7',
            '@maven//:com_softwaremill_macwire_proxy_2_12_2_3_7',
#            '@maven//:com_softwaremill_macwire_macrosakka_2_12'
#           "@maven//:org_json4s_json4s_core_2_12",
#           "@maven//:org_json4s_json4s_ast_2_12",
#           "@maven//:org_json4s_json4s_scalap_2_12",
        ]
    )

#All internal dependency ie., coming from packge in the same project has to come here
scala_library(
    name = "implementation",
    srcs = ["A.scala",
            "TestA.scala"
            ],
    deps = [],
)
