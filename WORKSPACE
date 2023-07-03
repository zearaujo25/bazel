load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# http_jar (
#     name = "apache-commons-lang",
#     url = "https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar"
# )

RULES_JVM_EXTERNAL_TAG = "2.0.1"
RULES_JVM_EXTERNAL_SHA = "55e8d3951647ae3dffde22b4f7f8dee11b3f70f3f89424713debd7076197eaca"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

DAGGER_TAG = "2.28.1"
DAGGER_SHA = "9e69ab2f9a47e0f74e71fe49098bea908c528aa02fa0c5995334447b310d0cdd"
http_archive(
    name = "dagger",
    strip_prefix = "dagger-dagger-%s" % DAGGER_TAG,
    sha256 = DAGGER_SHA,
    urls = ["https://github.com/google/dagger/archive/dagger-%s.zip" % DAGGER_TAG],
)

load("@dagger//:workspace_defs.bzl", "DAGGER_ARTIFACTS", "DAGGER_REPOSITORIES")



load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.apache.commons:commons-lang3:3.12.0" ,
    'org.springframework.boot:spring-boot-autoconfigure:2.1.3.RELEASE',
    'org.springframework.boot:spring-boot-starter-web:2.1.3.RELEASE',
    'org.springframework.boot:spring-boot:2.1.3.RELEASE',
    'org.springframework:spring-web:5.1.5.RELEASE',
    "org.springframework:spring-context:5.1.5.RELEASE",
    "org.immutables:value-annotations:2.9.2",
    "org.immutables:value:2.9.2",
    "com.fasterxml.jackson.core:jackson-databind:2.12.5",
    "com.fasterxml.jackson.core:jackson-annotations:2.12.5",
        ] + DAGGER_ARTIFACTS, 
    repositories = [ 
        "https://repo1.maven.org/maven2", 
    ] + DAGGER_REPOSITORIES )

