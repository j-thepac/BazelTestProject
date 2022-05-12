load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary","scala_library")
package(default_visibility = ["//visibility:public"])

scala_binary(
    name="emojitest",
    main_class="com.kyndryltest.emojitest.EmojiTest",
    srcs=[
        "EmojiTest.scala",

        ],
deps = [
    "emojidep"
],

)

scala_binary(
    name="emojirunner",
    main_class="com.kyndryltest.emojitest.EmojiRunner",
    srcs=[
        "EmojiRunner.scala",

        ],
deps = [
    "emojideplib"
],

)

scala_library(
    name = "emojideplib",
    srcs = ["EmojiLib.scala",

            ],
    deps = [
    "emojidep"
            ],

)


java_library(
    name = "emojidep",
    exports = [
 "@maven//:com_vdurmont_emoji_java_5_1_1"
        ]
    )