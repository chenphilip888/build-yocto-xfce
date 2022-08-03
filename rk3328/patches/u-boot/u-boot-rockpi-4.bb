DEFAULT_PREFERENCE = "1"

DESCRIPTION = "RockPi-4 U-Boot"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

include u-boot-rockpi.inc

SRC_URI = " \
	git://github.com/u-boot/u-boot.git;branch=next; \
"

SRCREV = "${AUTOREV}"

do_compile_append () {
	cp -a ${B}/tools/mkimage ${DEPLOY_DIR_IMAGE}
}
