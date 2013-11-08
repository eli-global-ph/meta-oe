SUMMARY = "Gnome-panel gconf init hack"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

SRC_URI = " \
           file://panelconf.sh \
"

inherit allarch

do_install () {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/panelconf.sh ${D}${bindir}/
    sed -i -e s:/etc:${sysconfdir}:g ${D}${bindir}/panelconf.sh
}

pkg_postinst_${PN} () {
  gconftool-2 --config-source=xml:readwrite:$D${sysconfdir}/gconf/gconf.xml.defaults \
    --direct --load $D${sysconfdir}/gconf/schemas/panel-default-setup.entries
}

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} = "gconf gnome-panel"
