// tuples -> an array with fixed length
type SOMETHING = [number, number, number];

const color: SOMETHING = [0, 0, 0];

// most generic use case
type HTTPResponse = [number, string];

const response: HTTPResponse = [200, "Success"];
const responseError: HTTPResponse = [0, "Error"];
const responseWarning: HTTPResponse = [0, "Warning"];
const responseInfo: HTTPResponse = [0, "Info"];


// tuples loop hole -> we can push or pop elements from tuple 
const tuple: [number, string, boolean] = [1, "2", true];

tuple.push("hello");
tuple.pop();
