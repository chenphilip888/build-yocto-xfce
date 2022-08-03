LICENSE = "CLOSED"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "resize-helper.service"

SRC_URI_append = " file://resize-helper.service file://resize-helper "
FILES_${PN} += "${systemd_system_unitdir}/resize-helper.service"
FILES_${PN} += "${sbindir}/resize-helper"

do_install_append() {
  install -d ${D}${sbindir}
  install -d ${D}/${systemd_system_unitdir}
  install -m 0755 ${WORKDIR}/resize-helper ${D}${sbindir}
  install -m 0644 ${WORKDIR}/resize-helper.service ${D}/${systemd_system_unitdir}
}
