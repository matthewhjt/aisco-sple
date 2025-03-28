#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.subscribedonate --module-path aisco.product.subscribedonate -m aisco.product.subscribedonate &

wait