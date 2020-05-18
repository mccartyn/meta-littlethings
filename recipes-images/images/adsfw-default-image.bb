DESCRIPTION = "Default image for a dead simple firewall device"
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_INSTALL_append = "wireguard-module wireguard-tools apache2 ufw iptables dropbear "

ERPC_COMPS ?= ""
ERPC_COMPS_append_mx7ulp = "packagegroup-imx-erpc"

CORE_IMAGE_EXTRA_INSTALL += " \
    ${ERPC_COMPS} \
"
