SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# gpio-test.c from local file
SRC_URI = "file://gpio-test.c"

# Set LDFLAGS options provided by the build system
TARGET_CC_ARCH += "${LDFLAGS}"

# Change source directory to workdirectory where hello-world.cpp is
S = "${WORKDIR}"

# Compile hello-world from sources, no Makefile
do_compile() {
    ${CXX} -Wall gpio-test.c -o gpio-test
}

# Install binary to final directory /usr/sbin
do_install() {
    install -d ${D}${sbindir}
    install -m 0755 ${S}/gpio-test ${D}${sbindir}
}
