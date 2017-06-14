SUMMARY = "Startup script for gem-tanzanite"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

SRC_URI = "file://init"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/${sysconfdir}/init.d
	install -m755 ${WORKDIR}/init ${D}/${sysconfdir}/init.d/gem-tanzanite
}

inherit allarch update-rc.d

RDEPENDS_${PN} = "gem-tanzanite"

INITSCRIPT_NAME = "gem-tanzanite"
INITSCRIPT_PARAMS = "start 99 5 2 . stop 10 0 1 6 ."
