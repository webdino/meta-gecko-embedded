SUMMARY = "Project Tanzanite: Sample demo contents for Project GEM (Gecko Embedded) "
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

SRC_URI = "git://github.com/gem-tanzanite/gem-tanzanite.github.io.git;protocol=git;branch=master \
           file://profile/user.js \
           file://profile/xulstore.json \
           file://gem-tanzanite \
          "
SRCREV = "5b36488d416dd3b767f7acfc90459106a60fbeb0"

PACKAGES = "${PN}"
RDEPENDS_${PN} = "firefox"

do_compile() {
        cd ${WORKDIR}/git
        git archive HEAD --prefix=html/ --output=${S}/gem-tanzanite.tar.gz
}

do_install() {
        install -d ${D}/${datadir}/${PN}/profile
        install -m 644 ${WORKDIR}/profile/user.js ${D}/${datadir}/${PN}/profile
        install -m 644 ${WORKDIR}/profile/xulstore.json ${D}/${datadir}/${PN}/profile
        tar xvf ${S}/gem-tanzanite.tar.gz -C ${D}/${datadir}/${PN}

        install -d ${D}/${bindir}
        install -m 755 ${WORKDIR}/gem-tanzanite ${D}/${bindir}
}

inherit allarch
