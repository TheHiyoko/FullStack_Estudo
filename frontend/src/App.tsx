import DataTable from "components/dataTable/dataTable";
import Footer from "components/footer/footer";
import NavBar from "components/NavBar/NavBar";

function App() {
  return (
    <>
      <NavBar/>
      <div className="container">
        <h1 className="text-primary">Olá mundo</h1>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
