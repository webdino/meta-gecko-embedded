FILESEXTRAPATHS_prepend := "${THISDIR}/weston-init:"

SRC_URI_append = " file://weston \
"

do_install_append() {
	install -d ${D}/${sysconfdir}/default
	install -m 755 ${WORKDIR}/weston ${D}/${sysconfdir}/default/weston
}
