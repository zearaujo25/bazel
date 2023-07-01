load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules()

java_binary(
    name = "MyNetflix",
    srcs = glob([
        "src/main/java/com/mynetflix/*.java",
        "src/main/java/com/mynetflix/spring/*.java",
        "src/main/java/com/mynetflix/model/*.java",
    ]),
    main_class = "com.mynetflix.spring.MyNetflixWebApp",
    plugins = [
        "//third_party:immutables_processor",
    ],
    resources = glob(["src/main/resources/**/*"]),
    deps = [
        ":dagger",
       "@maven//:org_immutables_value_annotations",
       "@maven//:com_fasterxml_jackson_core_jackson_databind",
       "@maven//:com_fasterxml_jackson_core_jackson_annotations",
        "@maven//:org_springframework_boot_spring_boot",
        "@maven//:org_springframework_boot_spring_boot_autoconfigure",
        "@maven//:org_springframework_boot_spring_boot_starter_web",
        "@maven//:org_springframework_spring_web",   ],
)
