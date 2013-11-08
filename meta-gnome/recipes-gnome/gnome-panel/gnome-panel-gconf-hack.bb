SUMMARY = "Gnome-panel gconf init hack"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

SRC_URI = "file://gnome-panel-gconf-hack.desktop  \
           file://panelconf.sh \
"

do_install () {
    install -d ${D}${sysconfdir}/xdg/autostart
    install -m -644 ${WORKDIR}/gnome-panel-gconf-hack.desktop ${D}${sysconfdir}/xdg/autostart/
    sed -i -e s:/usr/bin:${bindir}:g ${D}${sysconfdir}/xdg/autostart/gnome-panel-gconf-hack.desktop    

    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/panelconf.sh ${D}${bindir}/
    sed -i -e s:/etc:${sysconfdir}:g ${D}${bindir}/panelconf.sh
}

RDEPENDS_${PN} = "gconf gnome-panel"
