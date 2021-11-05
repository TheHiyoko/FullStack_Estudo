import BarChart from "components/barChart/barChart";
import DataTable from "components/dataTable/dataTable";
import DonutChart from "components/DounatChart/DonutChart";
import Footer from "components/footer/footer";
import NavBar from "components/NavBar/NavBar";

function App() {
  return (
    <>
      <NavBar/>
      <div className="container">
        <h1 className="text-primary py-3">Dashbord de vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h4 className="text-primary text-center">Todas as vendas</h4>
            <BarChart/>
          </div>
          <div className="col-sm-6">
            <h4 className="text-primary text-center">Todas as vendas</h4>
            <DonutChart/>
          </div>
        </div>
      <div>
        <h2 className="text-primatry py-3">Todas as vendas</h2>
        <DataTable/>
      </div>
      </div>
      <Footer/>
    </>
  );
}

export default App;
