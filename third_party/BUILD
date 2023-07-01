package(default_visibility = ["//visibility:public"])

java_plugin(
    name = "immutables_processor",
    generates_api = True,
    processor_class = "org.immutables.processor.ProxyProcessor",
    deps = [
        "@maven//:org_immutables_value",
    ],
)