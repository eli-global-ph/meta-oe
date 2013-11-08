#!/bin/sh

# This needs to be done only once for each user
if ! [ -e ${HOME}/.gconf/panelconf ] ; then
	gconftool-2 --config-source=xml:readwrite:/etc/gconf/gconf.xml.defaults --direct --load /etc/gconf/schemas/panel-default-setup.entries
	touch ${HOME}/.gconf/panelconf
fi
