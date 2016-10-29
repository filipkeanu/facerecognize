/*global cordova, module*/

module.exports = {
    startfacedetect: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "facedetect", "startfacedetect", [name]);
    }
};
